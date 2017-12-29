package com.example.dell.chalchitra2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MovieResponse {

    @SerializedName("page")
    private Integer page;
    @SerializedName("total_results")
    private Integer totalResults;
    @SerializedName("total_pages")
    private Integer totalPages;
    @SerializedName("results")
    private List<movie> results ;

    /**
     * No args constructor for use in serialization
     *
     */

    /**
     *
     * @param results
     * @param totalResults
     * @param page
     * @param totalPages
     */
    public MovieResponse(Integer page, Integer totalResults, Integer totalPages, List<movie> results) {
        super();
        this.page = page;
        this.totalResults = totalResults;
        this.totalPages = totalPages;
        this.page = page;
        this.results=results;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public List<movie> getResults() {
        return results;
    }

    public void setResults(List<movie> results) {
        this.results = results;
    }

}


