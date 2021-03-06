package main;

import calc.Calculator;

public class Main {

	public static void main(String[] args) {

		System.out.println("프로젝트 시작");
		System.out.println("share project 완료");
		System.out.println("commit 하면 Git Staging 창이 열림.");
		System.out.println("항목들 중에는 필요없는 파일들이 존재.");
		System.out.println("Git Ignore 파일에 불필요한 파일들을 추가");
		System.out.println("gitignore.io 사이트에 가면 자동으로 등록될 수 있도록 도와줌.");
		System.out.println("각종 운영체제, 이클립스, 자바, 빌드툴을 작성 후 생성 버튼을 클릭");
		System.out.println(".gitignore 파일에 복사붙여넣기");
		System.out.println(".settings .classpath .project 도 .gitignore파일에 추가하기");
		System.out.println("Add allfiles 해서 staged Changes 로 변경하기");
		System.out.println("show in history에서 내가 commint 한 내역을 볼 수 있음.");
		System.out.println("Git Hub 가서 Repository 하나 생성 후 그곳에 등록하기");
		
		System.out.println("브랜치 따서 계산기 모듈 구현해보기");

		Calculator c = new Calculator();
		int addResult = c.add(1, 2);
		System.out.println(addResult);
		System.out.println("더하기 모듈 개발 완료");
		
		System.out.println("Reject 뜰때는 Pull 로 땡겨온 뒤 수정 후 다시 commit 후 push");

		System.out.println("빼기 모듈도 개발");
		int subResult = c.subtract(10, 5);
		System.out.println(subResult);
		System.out.println("빼기 모듈 개발 완료");
		
		System.out.println("다른 팀원 누군가가 적어놓은 30번째 라인(remote)");
		System.out.println("다른 팀원 누군가가 적어놓은 31번째 라인(remote)");
		System.out.println("다른 팀원 누군가가 적어놓은 32번째 라인(remote)");
		
		System.out.println("집에 가서도 일해야지~!");
		
		System.out.println("import, Destination 설정 완료 집에서도 일하자");
		
		System.out.println("브랜치 따서 곱하기 모듈 만들기");
		
		int multiResult = c.multi(3, 5);
		System.out.println(multiResult);
		System.out.println("곱하기 모듈 개발 완료");
		
	}

}
