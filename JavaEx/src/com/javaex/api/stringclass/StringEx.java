package com.javaex.api.stringclass;

public class StringEx {

	public static void main(String[] args) {
//		stringBasic();
		usefullMethod();
//		stringBufferEx();
	}

	private static void stringBufferEx() {
		//	String 이 불변 객체, StringBuffer는 가변 객체(내부 데이터 변경 가능);
		StringBuffer sb = new StringBuffer("This");
		
		//	문자열 뒤에 연결: append
		sb.append(" is pencil");
		
		//	문자열 삽입 : insert
		sb.insert(8, "my");
		
		//	문자열 치환 : replace
		sb.replace(8, 10, "your ");
		
		System.out.println("최종 문자열:" + sb);	//	최종 출력떄까지 새 객체가 생성되지 않음
		
		//	버버 길이 변경: setLength
		sb.setLength(10);
		System.out.println("버버 조정:" + sb);	//	버퍼를 강제로 줄임 10칸
		
		//	메서드 체이닝 기법  **앞으로 고급기법으로 자주 사용**
		String s = new StringBuffer("This")
						.append(" is pencil")
						.insert(8, "my")
						.replace(8, 10, "your ")
						.toString();	//	sb -> String
		System.out.println("메서드 체이닝:" +s);
		}
	
	private static void usefullMethod() {
		// String 다양한 메서드들
		String source = "java Programming, JavaScript Programming";
		System.out.println("원본:" + source);

		// 인덱스 접근
		System.out.println("length:" + source.length());
		System.out.println("5번 인덱스의 글자:" + source.charAt(5));

		// 변환 메서드
		System.out.println("모두 소문자:" + source.toLowerCase());
		System.out.println("모두 대문자:" + source.toUpperCase());

		// 검색 메서드 **중요**
		int index = 0;
		index = source.indexOf("Java");
		System.out.println("1st Search:" + index);

		index += "Java".length(); // 인덱스를 4글자 뒤로 이동
		index = source.indexOf("Java", index); // 검색 시작 인덱스
		System.out.println("2nd Search:" + index);
		index = source.indexOf("Java", index + "Java".length());
		System.out.println("3rd Search:" + index); // 검색할 내용이 없을때 -> -1

		index = source.lastIndexOf("Java");
		System.out.println("역방향 검색:" + index);

		// 추출
		System.out.println("18번 인덱스 ~:" + source.substring(18)); // 끝까지
		System.out.println("18 ~ 21:" + source.substring(18, 23)); // 18 ~ (22-1)

		// 치환 메서드
		System.out.println("Replace:" + source.replaceAll("Java", "Python"));

		// 변환, 치환, 추출 메서드를 수행해도 원본이 변경되지는 않는다
		System.out.println("원본:" + source); // String(문자열)은 불변 객체 (immutable)

		// Whitespace 제거 (공백제거)
		String str = "            Hello      "; // 앞 뒤 공백
		System.out.println("trim:[" + str.trim() + "]");

		// 문자열 분절
		String words[] = source.split(" "); // 공백을 기준으로 문자열 분리 -> 배열

		for (String data : words) {
			System.out.println("chunk:" + data);
		}

		// 문자열의 비교:
		// compareTo : 같으면 0, 작으면 -1, 크면 1
		System.out.println("ABC".compareTo("ABD"));
		System.out.println("ABC".compareTo("ABC"));
	}

	private static void stringBasic() {
		String s1 = "Java"; // 리터럴
		String s2 = new String("Java"); // 새로운 객체
		String s3 = "Java"; // 리터럴

		System.out.println("s1, s2 같은 객체 ? " + (s1 == s2));
		System.out.println("s1, s3 같은 객체 ? " + (s1 == s3));

		// String은 Char의 집합
		char letters[] = { 'J', 'a', 'v', 'a' };
		String s4 = new String(letters);

		System.out.println("s4 = " + s4);

		// valueOf 메서드 -> 기본 타입을 문자열로 변환
		String s5 = String.valueOf(3.14159f);
		System.out.println("s5 = " + s5);
	}

}
