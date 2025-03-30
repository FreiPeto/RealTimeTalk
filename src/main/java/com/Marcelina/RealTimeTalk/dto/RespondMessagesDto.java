package com.Marcelina.RealTimeTalk.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RespondMessagesDto {
    private Long id;
    private Long conversationId;
    private RespondUserDto sender;
    private String fileName;
    private String fileUrl;
    private String content;
    private LocalDateTime timestamp;
}
