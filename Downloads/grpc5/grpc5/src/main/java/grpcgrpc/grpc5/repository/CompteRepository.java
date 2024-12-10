package grpcgrpc.grpc5.repository;

import grpcgrpc.grpc5.entity.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, String> {

}

