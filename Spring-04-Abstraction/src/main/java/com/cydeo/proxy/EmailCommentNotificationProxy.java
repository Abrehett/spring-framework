package com.cydeo.proxy;

import com.cydeo.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("EMAIL")

public class EmailCommentNotificationProxy implements CommentNotificationProxy{

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment : " + comment.getText());
    }

    public static interface CommentRepository {
        void storeComment(Comment comment);

    }
}