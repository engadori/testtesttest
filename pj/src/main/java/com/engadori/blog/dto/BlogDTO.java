package com.engadori.blog.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Builder
public class BlogDTO {

    @Builder.Default private Integer postIdx = null;
    @Builder.Default private String userId = null;
    @Builder.Default private String title = null;
    @Builder.Default private String contents = null;

}
