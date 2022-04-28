package com.ag04.utils;

/**
 *
 * @author ivonaraguz
 */
public interface DummyService {
    
    DummyDTO get(Long id);

    DummyDTO save(DummyDTO testDto);
}
