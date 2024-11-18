package com.content.models;


import com.content.constant.Languages;
import com.content.constant.SubTitles;
import com.content.constant.VideoType;
import com.content.models.helper.Tags;
import com.content.utils.VideoConstantConverter;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "videos")
@Getter
@Setter
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String thumbnail;
    private String url;
    private String userId;
    @Enumerated(EnumType.STRING)
    private VideoType type;

    @Convert(converter = VideoConstantConverter.class)
    private Set<Languages> languages;

    @Convert(converter = VideoConstantConverter.class)
    private Set<SubTitles> subTitles;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name = "video_id")
    private Set<Tags> tags;

}