package digital.patron.webmobile.artwork.repository;

import digital.patron.webmobile.artwork.domain.ArtworkTag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtworkTagRepository extends JpaRepository<ArtworkTag, Long> {
}
