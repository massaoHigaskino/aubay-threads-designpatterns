package com.designsall.alldesigntogether;

import com.designsall.alldesigntogether.dto.FabricaDTO;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class FabricaDTOTest {
    @Test
    public void createDTOTest() {
        System.out.println(Optional.ofNullable(FabricaDTO.createDTO("Token")).map(o -> o.getClass().getName()).orElse("NULL"));
    }
}
