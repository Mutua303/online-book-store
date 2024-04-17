package com.example.MutuaBooks.authors;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateAuthorReq {
    private String authorName;
    private String bio;
}

