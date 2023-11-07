package microservices.book.gamification.game.controller;

import lombok.RequiredArgsConstructor;
import microservices.book.gamification.challenge.dto.ChallengeSolvedDTO;
import microservices.book.gamification.game.service.GameService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/attempts") @RequiredArgsConstructor
public class GameController {
    private final GameService gameService;
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    void postResult(@RequestBody ChallengeSolvedDTO dto) {
        gameService.newAttemptForUser(dto);
    }
}
