package com.yusufsoysal.algorithms.interview;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class FindAnagramsInListTest {

    private final FindAnagramsInList findAnagrams = new FindAnagramsInList(Arrays.asList("watch", "tac", "arc", "act"));

    @Test
    public void shouldFindMultipleAnagrams(){
        assertThat(findAnagrams.find("cat"), CoreMatchers.equalTo(Arrays.asList("tac", "act")));
    }

    @Test
    public void shouldFindSingleAnagram(){
        assertThat(findAnagrams.find("car"), CoreMatchers.equalTo(Collections.singletonList("arc")));
    }

    @Test
    public void shouldReturnEmptyListForNotFoundWord(){
        assertThat(findAnagrams.find("tree"), CoreMatchers.equalTo(Collections.EMPTY_LIST));
    }

    @Test
    public void shouldReturnEmptyListForNullValue(){
        assertThat(findAnagrams.find(null), CoreMatchers.equalTo(Collections.EMPTY_LIST));
    }
}