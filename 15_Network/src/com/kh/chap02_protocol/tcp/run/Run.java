package com.kh.chap02_protocol.tcp.run;

public class Run {
	public static void main(String[] args) {
		/*
		 * TCP
		 *  - 서버와 클라이언트간의 연결지향형 통신방법
		 *  - 서버와 클라이언트 모두 연결이 되어 있어야 데이터를 교환한다.
		 *  - 신뢰성 있고 안전한 데이터 전달이 가능
		 *  - 클라이언트와 서버간에 연결이 되어 있으므로 실시간으로 데이터 송수신이 가능.
		 *  
		 * Socket
		 *  - 클라이언트와 서버간에 실시간 "통신"에 사용되는 객체
		 *  - 소켓이 소유한 ip번호와 port번호를 통해 누구의 소켓인지 식별할 수 있다.
		 *  - 입/출력을 위한 input/output 스트림을 소유하고 있다.
		 * 
		 * ServerSocket
		 *  - 서버에서 생성하는 소켓으로 클라이언트의 요청을 대기한다.
		 *  - 연결요청이 들어오면 Socket을 생성하여 클라이언트에게 전달한다. 
		 * 
		 * ClientSocket(Socket)
		 *  - 서버와 통신에 사용되는 클라이언트 소켓
		 *  - 서버의 ip주소, 포트번호를 통해 서버에게 연결요청을 보낸다.
		 *  */
	}
}








