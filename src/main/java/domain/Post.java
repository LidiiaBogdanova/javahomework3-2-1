package domain;

import java.util.Date;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private Date date;
    private String textURL;
    private String text;
    private  int replyOwnerId;
    private int postId;
    private boolean friendsOnly;
    private Copyright copyright;
    private CommentsInfo commentsInfo;
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;
    private String postType;
    private PostSource postSource;
    private Geo geo;
    private int signerId;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private boolean isFavorite;
    private Donut donut;
    private int postponedId;



}
