package com.example.MutuaBooks.authors;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EditAuthorReq {
    private Long id;
    private String authorName;
    private String bio;
}

