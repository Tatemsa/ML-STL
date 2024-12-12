package Stl.ML.ml.client.manager;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Stl.ML.ml.client.model.Client;
import Stl.ML.ml.client.service.ClientRepository;

@Service
@RestController
@RequestMapping(path = "client")
public class ClientManager {

	@Autowired
	private ClientRepository userRepository;

	@GetMapping(path = "")
	public List<Client> getAll() {
		return userRepository.findAll();
	}

	@GetMapping(path = "/{id}")
	public Optional<Client> getByID(@PathVariable int id) {
		return userRepository.findById(id);
	}

}
