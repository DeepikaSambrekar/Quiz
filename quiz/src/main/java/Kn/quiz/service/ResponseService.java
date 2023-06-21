package Kn.quiz.service;

import java.util.Optional;

import Kn.quiz.model.Response;
import Kn.quiz.repository.ResponseRepository;

public class ResponseService {
     private final ResponseRepository responseRepository;

    public ResponseService(ResponseRepository responseRepository) {
        this.responseRepository = responseRepository;
    }

    public Response saveResponse(Response response) {
        return responseRepository.save(response);
    }

    public Optional<Response> getResponseById(Long id) {
        return responseRepository.findById(id);
    }

    public void deleteResponseById(Long id) {
        responseRepository.deleteById(id);
    }
    
}
