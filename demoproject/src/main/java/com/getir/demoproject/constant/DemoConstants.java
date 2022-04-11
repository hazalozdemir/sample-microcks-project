package com.getir.demoproject.constant;

import com.getir.demoproject.model.User;

import java.util.List;

public class DemoConstants {

    private DemoConstants(){}

    public static final List<User> users = List.of(new User("user1Name", "user1Surname"), new User("user2Name", "user2Surname"), new User("user3Name", "user3Surname"), new User("user4Name", "user4Surname"), new User("user5Name", "user5Surname"), new User("user6Name", "user6Surname"), new User("user7Name", "user7Surname"), new User("user8Name", "user8Surname"));
}
