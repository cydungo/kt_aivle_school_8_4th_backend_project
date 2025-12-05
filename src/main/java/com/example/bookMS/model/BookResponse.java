// src/main/java/com/example/backend/dto/BookResponse.java
package com.example.bookMS.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Builder
@Setter
public class BookResponse {
    private Long id;
    private String title;
    private String content;
    private String coverImageUrl;  // 카드/상세에서 둘 다 사용
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
