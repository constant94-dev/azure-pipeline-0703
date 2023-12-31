package com.tvpatron.member.domain;

import com.tvpatron.exhibition.domain.Exhibition;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter(AccessLevel.PRIVATE)
@AllArgsConstructor
public class BusinessMember {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100)
    private String office_name;
    @OneToMany(mappedBy = "businessMember")
    private Set<Exhibition> exhibitions = new HashSet<>();

    protected BusinessMember() {
    }

}
