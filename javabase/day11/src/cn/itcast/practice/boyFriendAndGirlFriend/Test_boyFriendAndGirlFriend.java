package cn.itcast.practice.boyFriendAndGirlFriend;

public class Test_boyFriendAndGirlFriend {
    public static void main(String[] args) {
        GirlFriend girlFriend = new GirlFriend("张嘉敏", 24);
        GirlFriend girlFriend2 = new GirlFriend("韩卓君", 20);
        BoyFriend boyFriend = new BoyFriend("麻少飞", 29, girlFriend);
        boyFriend.shopping(girlFriend);
        boyFriend.shopping(girlFriend2);
        boyFriend.shopping();

        BoyFriend boyFriend2 = new BoyFriend("麻志强", 29);
        boyFriend2.shopping(girlFriend2);
        boyFriend2.shopping();

    }
}
