package com.morecommit.carrotEz.dto.response.board;

import com.morecommit.carrotEz.dto.response.user.ResponseDto;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

@Getter



public class PostBoardResponseDto extends ResponseDto {
    private PostBoardResponseDto(){
        super(ResponseCode.SUCCESS, ResponseMessage.SUCCES);
    }
    public static ResponseEntity<PostBoardResponseDto> success(){
        PostBoardResponseDto result = new PostBoardResponseDto();
        return ResponseEntity.status(HttpStatusCode.OK).body(result);
    }
    // 존재하지 않는 사용자
    public static ResponseEntity<ResponseDto> notExistUser(){
        ResponseDto result = new ResponseDto(ResponseCode.NOT_EXISTED_USER, ResponseMessage.NOT_EXITED_USER);
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(result);

    }

}