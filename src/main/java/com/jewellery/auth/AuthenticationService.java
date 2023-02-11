package com.jewellery.auth;


import com.jewellery.config.JwtService;
import com.jewellery.user.Role;
import com.jewellery.user.User;
import com.jewellery.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
  private final UserRepository repository;
  private final PasswordEncoder passwordEncoder;
  private final JwtService jwtService;
  private final AuthenticationManager authenticationManager;

  public AuthenticationResponse register(RegisterRequest request) {
    var user = User.builder()
        .firstname(request.getFirstname())
        .lastname(request.getLastname())
        .email(request.getEmail())
        .password(passwordEncoder.encode(request.getPassword()))
        .phoneNumber(request.getPhonenumber())
        .address(request.getAddress())
        .role(request.getRole())
        .build();
    repository.save(user);
    var jwtToken = jwtService.generateToken(user);
    return AuthenticationResponse.builder()
        .token(jwtToken)
        .build();
  }

  public AuthenticationResponse authenticate(AuthenticationRequest request) {
    authenticationManager.authenticate(
        new UsernamePasswordAuthenticationToken(
            request.getEmail(),
            request.getPassword()
        )
    );
    var user = repository.findByEmail(request.getEmail())
        .orElseThrow();
    var jwtToken = jwtService.generateToken(user);
    return AuthenticationResponse.builder()
        .token(jwtToken)
        .build();
  }

public AuthenticationResponse addvendor(RegisterRequest request) {
	var user = User.builder()
			.firstname(request.getFirstname())
	        .lastname(request.getLastname())
	        .email(request.getEmail())
	        .password(passwordEncoder.encode(request.getPassword()))
	        .phoneNumber(request.getPhonenumber())
	        .address(request.getAddress())
	        .role(request.getRole())
	        .build();
	    repository.save(user);
	    var jwtToken = jwtService.generateToken(user);
	    return AuthenticationResponse.builder()
	        .token(jwtToken)
	        .build();
}

public AuthenticationResponse updateVendor(User user) {
	var users = User.builder()
			.firstname(user.getFirstname())
	        .lastname(user.getLastname())
	        .email(user.getEmail())
	        .password(passwordEncoder.encode(user.getPassword()))
	        .phoneNumber(user.getPhoneNumber())
	        .address(user.getAddress())
	        .role(user.getRole())
	        .build();
	    repository.save(users);
	    var jwtToken = jwtService.generateToken(users);
	    return AuthenticationResponse.builder()
	        .token(jwtToken)
	        .build();
}
}
