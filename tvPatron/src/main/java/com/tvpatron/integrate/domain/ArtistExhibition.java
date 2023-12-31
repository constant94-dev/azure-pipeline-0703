package com.tvpatron.integrate.domain;

import com.tvpatron.artist.domain.Artist;
import com.tvpatron.exhibition.domain.Exhibition;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "artist_exhibition_relation")
@Getter
@Setter(AccessLevel.PRIVATE)
public class ArtistExhibition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Artist artist;

    @ManyToOne(fetch = FetchType.LAZY)
    private Exhibition exhibition;

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public void setExhibition(Exhibition exhibition) {
        this.exhibition = exhibition;
    }

}
