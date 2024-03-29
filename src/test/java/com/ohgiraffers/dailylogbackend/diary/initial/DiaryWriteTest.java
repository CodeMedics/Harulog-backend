//package com.ohgiraffers.dailylogbackend.diary.write;
//
//import com.ohgiraffers.dailylogbackend.diary.InsertFakeUser;
//import com.ohgiraffers.dailylogbackend.diary.command.application.dto.DiaryWriteDTO;
//import com.ohgiraffers.dailylogbackend.diary.command.application.service.DiaryService;
//import com.ohgiraffers.dailylogbackend.diary.command.domain.aggregate.entity.DiaryEntity;
//import com.ohgiraffers.dailylogbackend.member.command.domain.aggregate.entity.MemberEntity;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//@SpringBootTest
////@DataJpaTest // 데이터 롤백됨
////@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//public class DiaryWriteTest {
//
//    @Autowired
//    private DiaryService diaryService;
//
//    @Autowired
//    private InsertFakeUser insertFakeUser;
//
////    @Autowired
////    private DiaryRepository diaryRepository;
//
//        MemberEntity fakeUser = insertFakeUser.insertFakeUser();
//
//    @Test
//    @DisplayName("diary insert test")
//    public void testWriteDiary() {
//        // Arrange
//
//        MemberEntity memberEntity = MemberEntity.builder()
//                .memberNo(fakeUser.getMemberNo())
//                .build();
//
//        DiaryWriteDTO diaryWriteDTO = new DiaryWriteDTO(memberEntity, "lol", "good");
//
////        DiaryEntity de = new DiaryEntity(diaryWriteDTO.getMemberEntity(),
////                diaryWriteDTO.getDiaryContent(),
////                diaryWriteDTO.getFeelCategory());
//
//        // Act
//        DiaryEntity diaryEntity = diaryService.writeDiary(diaryWriteDTO);
//
////        DiaryEntity diaryEntity = diaryRepository.save(de);
//
//        // Assert
//        assertNotNull(diaryEntity);
//        assertEquals(diaryWriteDTO.getDiaryContent(), diaryEntity.getDiaryContent());
//        assertEquals(diaryWriteDTO.getFeelCategory(), diaryEntity.getFeelCategory());
//
//        insertFakeUser.deleteFakeUser(fakeUser);
//    }
//}
