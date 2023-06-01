package com.lacus.domain.datasync.job.dto;

import lombok.Data;

import java.util.LinkedList;

@Data
public class MappedColumnDTO {
    private Long jobId;
    private LinkedList<ColumnDTO> mappedSourceColumns;
    private LinkedList<ColumnDTO> mappedSinkColumns;
}
