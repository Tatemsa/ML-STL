package Stl.ML.ml.client.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Stl.ML.ml.client.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {


}
