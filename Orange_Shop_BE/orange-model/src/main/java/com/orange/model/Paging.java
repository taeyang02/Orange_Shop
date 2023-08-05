package com.orange.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class Paging<T> implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private transient List<T> items;
    private int pageSize;
    private long pageNum;
    private long totalCount;

    public long getTotalPage() {
        return (totalCount + pageSize - 1) / pageSize;
    }
}
