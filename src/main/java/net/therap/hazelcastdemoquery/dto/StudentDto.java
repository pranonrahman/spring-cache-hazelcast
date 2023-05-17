package net.therap.hazelcastdemoquery.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author raianrahman
 * @since 5/17/23
 */
@Data
@Builder
public class StudentDto implements Serializable {

    private Long id;

    private String name;
}
