package com.shaks.TodoDemo.payLoad.response;

import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TodoRequest {
    private String title;
    private String description;
    private String status;
}
