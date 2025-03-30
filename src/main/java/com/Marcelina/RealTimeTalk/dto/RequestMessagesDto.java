package com.Marcelina.RealTimeTalk.dto;

import com.Marcelina.RealTimeTalk.model.Users;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestMessagesDto {
    @NotNull(message = "ConversationId must not be null")
    private Long conversationId;
    @NotNull(message = "SenderId must not be null")
    private Long senderId;
    private String content;
    private String fileName;
    private String fileUrl;
}
