package com.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public void run() {
        System.out.println("=== 명언 ===");

        int cnt = 0;
        List<Quotation> quotations = new ArrayList<>();

        while (true) {
            System.out.print("명령) ");

            Scanner sc = new Scanner(System.in);
            String cmd = sc.nextLine();
/* 좌변 저장할 공간(변수) 변수명은 제약조건이 없음
대신 해당하는 내용이 맞게 설정 우변은 저장할 내용 모음을 줄이고 자음만 쓰는 경우가 많음
 */
            if (cmd.equals("종료")) {
                break; // continue 무한루프 빠짐
            } else if (cmd.equals("등록")) {

                System.out.print("명언 : ");
                String content = sc.nextLine();

                System.out.print("작가 : ");
                String authorName = sc.nextLine();

                cnt++;
                int id = cnt;

                Quotation quotation = new Quotation(id, content, authorName);
                quotations.add(quotation);

                System.out.printf("%d번 명언이 등록되었습니다.\n", cnt);
//                System.out.printf("명언 : %s , 작가 : %s\n", content, authorName);
            } else if (cmd.equals("목록")) {
//                System.out.println("총 개수 : " + quotations.size());
                System.out.println("번호 / 작가 / 명언");

                System.out.println("----------------------------------------");

                if(quotations.isEmpty()){
                    System.out.println("등록된 명언이 없습니다.");
                }

                for (int i = quotations.size()-1; i > -1; i--) {
                    Quotation quotation = quotations.get(i);
                    System.out.println(quotation.id + ". " + quotation.content + " (" + quotation.authorName + ")");
                }

            }
        }
    }
}