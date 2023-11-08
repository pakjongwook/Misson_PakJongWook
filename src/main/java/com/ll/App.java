package com.ll;

import java.util.Scanner;

public class App {
    public void run() {

        while(true) {
            System.out.println("=== 명언 ===");
            System.out.print("명령) ");

            Scanner sc = new Scanner(System.in);
            String cmd = sc.nextLine();
/* 좌변 저장할 공간(변수) 변수명은 제약조건이 없음
대신 해당하는 내용이 맞게 설정 우변은 저장할 내용 모음을 줄이고 자음만 쓰는 경우가 많음
 */
            if(cmd.equals("종료")){
                break; // continue 무한루프 빠짐
            }
            System.out.println("입력한 명령 : " + cmd);
        }
    }
}