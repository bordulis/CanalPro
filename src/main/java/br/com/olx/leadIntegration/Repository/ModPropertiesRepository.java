package br.com.olx.leadIntegration.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.olx.leadIntegration.DTO.ModProperties;

@Repository
public interface ModPropertiesRepository extends JpaRepository<ModProperties, Integer> {

}
