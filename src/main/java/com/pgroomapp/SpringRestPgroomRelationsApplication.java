package com.pgroomapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRestPgroomRelationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestPgroomRelationsApplication.class, args);
	}

/*

	@Autowired
	IRoomService roomService;
	@Autowired
	IRoomMateService roomMateService;
	@Autowired
	IPGRoomService pgRoomService;

	@Override
	public void run(String... args) throws Exception {

		BranchLocation branchLocation=new BranchLocation("Marathalli","Bengaluru","Karnataka",560087);
		PGBranch pgBranch=new PGBranch(2,"Shree Lakshmi Venkateshwara 2",10,branchLocation);
		pgRoomService.addPGRoom(pgBranch);

		MemberAdress memberAdress=new MemberAdress("thatipur","Gwalior","Madhya Pradesh",474011);
		RoomMember roomMember=new RoomMember(3,"Arnav Sharma", Purpose.STUDENT,memberAdress,new Facilities[]{Facilities.WIFI},7000.0);
		roomMateService.addRoomMate(roomMember);

		MemberAdress memberAdress2=new MemberAdress("katha","Bhind","Madhya Pradesh",477445);
		RoomMember roomMember2=new RoomMember(4,"Arvind Sharma", Purpose.JOB,memberAdress2,new Facilities[]{Facilities.WIFI,Facilities.ROOMClEANING},8000.0);
		roomMateService.addRoomMate(roomMember2);

		List<RoomMember> MemberList= Arrays.asList(roomMember,roomMember2);

		System.out.println(MemberList);
		System.out.println(pgBranch);

		Room room=new Room(2,MemberList,2,7000.0,false,false,WallColor.RED,true,pgBranch);
		roomService.addRoom(room);

	}

*/
}
