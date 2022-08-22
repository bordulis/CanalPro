package br.com.olx.leadIntegration.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.olx.leadIntegration.DTO.Images;

@Repository
public interface ImagesRepository extends JpaRepository<Images, Integer> {

	List<Images> findByItemId(Integer itemId);
}