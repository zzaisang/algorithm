package main.java.algorithm.programers.etc;

import java.util.*;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2022/01/01
 */
public class _오픈채팅방 {

    public static void main(String[] args) {
        _오픈채팅방 T = new _오픈채팅방();
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        for (String s : T.solution(record)) {
            System.out.println(s);
        }
    }

    public String[] solution(String[] record) {
        List<Enter> list = new LinkedList();
        HashMap<String, String> nickNameMap = new HashMap<>();

        for(String str : record){
            String[] keyword = str.split(" ");
            String type = keyword[0];
            String userId = keyword[1];
            if(type.equals("Enter")){
                nickNameMap.put(userId,keyword[2]);
                list.add(new Enter(userId,type));
            }else if(type.equals("Change")){
                nickNameMap.put(userId,keyword[2]);
            }else {
                list.add(new Enter(userId,type));
            }
        }

        String[] answer = new String[list.size()];
        int idx = 0;
        for (Enter enter : list) {
            String nickName = nickNameMap.get(enter.getUserId());
            enter.setNickName(nickName);
            answer[idx++] = enter.toString();
        }
        return answer;
    }

    static class Enter {

        private String enterType;
        private String userId;
        private String nickName;

        public Enter(String userId,String enterType){
            this.userId = userId;
            this.enterType = enterType;
        }

        public void setNickName(String nickName){
            this.nickName = nickName;
        }

        public String getUserId(){
            return userId;
        }

        public String toString(){
            if("Enter".equals(enterType)){
                return this.nickName + "님이 들어왔습니다.";
            }else {
                return this.nickName + "님이 나갔습니다.";
            }
        }
    }

}