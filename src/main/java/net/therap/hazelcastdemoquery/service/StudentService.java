package net.therap.hazelcastdemoquery.service;

import com.hazelcast.map.IMap;
import com.hazelcast.spring.cache.HazelcastCacheManager;
import lombok.RequiredArgsConstructor;
import net.therap.hazelcastdemoquery.dto.StudentDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author raianrahman
 * @since 5/17/23
 */
@Service
@RequiredArgsConstructor
public class StudentService {

    private final HazelcastCacheManager hazelcastCacheManager;

    public StudentDto putStudent(StudentDto studentDto) {

        IMap<Long, StudentDto> studentMap = hazelcastCacheManager.getHazelcastInstance().getMap("student");

        return studentMap.put(studentDto.getId(), studentDto);
    }

    public void setStudent(StudentDto studentDto) {

        IMap<Long, StudentDto> studentMap = hazelcastCacheManager.getHazelcastInstance().getMap("student");

        studentMap.set(studentDto.getId(), studentDto);
    }

    public StudentDto getStudent(Long id) {
        IMap<Long, StudentDto> studentMap = hazelcastCacheManager.getHazelcastInstance().getMap("student");

        return studentMap.get(id);
    }

    public void removeStudent(Long id) {
        IMap<Long, StudentDto> studentMap = hazelcastCacheManager.getHazelcastInstance().getMap("student");

        studentMap.remove(id);
    }

    public List<StudentDto> getAllStudent() {
        IMap<Long, StudentDto> studentMap = hazelcastCacheManager.getHazelcastInstance().getMap("student");

        return new ArrayList<>(studentMap.values());
    }
}
