package cqjtu.bg.service.impl;

import cqjtu.bg.dal.entity.Content;
import cqjtu.bg.dal.ContentRepo;
import cqjtu.bg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private ContentRepo contentRepo;

    @Override
    public void posting() {
        Content content=new Content();
        content.setImageUrl("url");
        content.setReleaseDate(new Date());
        content.setText("没哟text");
        content.setUsername("没有username");

        contentRepo.save(content);
    }
}
