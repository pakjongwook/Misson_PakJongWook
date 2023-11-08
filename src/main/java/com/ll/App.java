package com.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    Scanner sc = new Scanner(System.in);

    int cnt = 0;

    List<Quotation> quotations = new ArrayList<>();
    public void run() {
        System.out.println("=== 명언 ===");



        while (true) {
            System.out.print("명령) ");

            String cmd = sc.nextLine();

            if (cmd.equals("종료")) {
                break; // continue 무한루프 빠짐
            } else if (cmd.equals("등록")) {
                insertQuotation();
            } else if (cmd.equals("목록")) {
                selectQuotation();
            } else if (cmd.equals("삭제?")) {
                deleteQuotation(cmd);
            }else if (cmd.equals("수정")) {
                updateQuotation();
            } else {
                System.out.println("올바른 명령어를 입력하세요.");
            }
        }
    }

    void insertQuotation(){
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

    }

    void selectQuotation(){
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

    void deleteQuotation(String cmd){
        String idStr = cmd.replace("삭제?id=", "");
        int id = Integer.parseInt(idStr);

        System.out.printf("%d번 명언을 삭제합니다.\n", id);
    }

    void updateQuotation(){}
}