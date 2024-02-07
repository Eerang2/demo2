package com.testExample.practice.set.view;

import com.testExample.practice.set.controller.LotteryController;
import com.testExample.practice.set.model.vo.Lottery;

import java.util.*;

public class LotteryMenu {

    private LotteryController lotteryController;
    private Scanner scanner;
    private Lottery winner;

    public LotteryMenu() {
        this.lotteryController = new LotteryController();
        this.scanner = new Scanner(System.in);
    }

    public void mainMenu() {
        int choice;
        do {
            System.out.println("========== KH 추첨 프로그램 ==========");
            System.out.println("******* 메인 메뉴 *******");
            System.out.println("1. 추첨 대상 추가"); // insertObject() 실행
            System.out.println("2. 추첨 대상 삭제"); // deleteObject()
            System.out.println("3. 당첨 대상 확인"); // winObject()
            System.out.println("4. 정렬된 당첨 대상 확인"); // sortedWinObject()
            System.out.println("5. 당첨 대상 검색"); // searchWinner()
            System.out.println("9. 종료"); // “프로그램 종료.” 출력 후 main()으로 리턴
            System.out.print("메뉴 번호 선택: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    insertObject();
                    break;
                case 2:
                    deleteObject();
                    break;
                case 3:
                    winObject();
                    break;
                case 4:
                    sortedWinObject();
                    break;
                case 5:
                    searchWinner();
                    break;
                case 9:
                    System.out.println("프로그램 종료.");
                    return; // main()으로 리턴하여 종료
                default:
                    System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");

            }
        } while (true);
    }

    public void insertObject() {
        System.out.println("추가할 대상 수: ");
        int numEntries = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numEntries; i++) {
            System.out.println("추첨자 이름: ");
            String name = scanner.nextLine();

            System.out.println("추첨자 번호('-') 빼고): ");
            String phone = scanner.nextLine();

            Lottery newEntry = new Lottery(name, phone);
            boolean success = lotteryController.insertObject(newEntry);

            if (!success) {
                System.out.println("중복");
                i--;
            }
        }
        System.out.println("추가 완");
    }

    public void deleteObject() {
        System.out.println("삭제 대상 이름: ");
        String name = scanner.next();

        System.out.println("삭제 대상의 핸드폰 번호:");
        String phone = scanner.next();

        Lottery targetEntry = new Lottery(name, phone);
        boolean success = lotteryController.deleteObject(targetEntry);

        if (success) {
            System.out.println("삭제 완");
        } else {
            System.out.println("존재하지 않는 대상");
        }
    }

    public void winObject() {
        Set<Lottery> winners = lotteryController.getWinners();
        if (winners.isEmpty()) {
            System.out.println("대상 없음");
        } else {
            System.out.println("대상 확인");
            for (Lottery winner : winners) {
                System.out.println("이름: " + winner.getName() + "폰번호: " + winner.getPhone());
            }
        }
    }

    public void sortedWinObject() {
        Set<Lottery> sortedWinners = lotteryController.getSortedWinners();

        if (sortedWinners.isEmpty()) {
            System.out.println("당첨 대상이 없습니다.");
        } else {
            System.out.println("정렬된 당첨 대상 확인:");
            Iterator<Lottery> iterator = sortedWinners.iterator();
            while (iterator.hasNext()) {
                Lottery winner = iterator.next();
                System.out.println("이름: " + winner.getName() + ", 핸드폰 번호: " + winner.getPhone());
            }
        }
    }

    public void searchWinner() {

    }
}




