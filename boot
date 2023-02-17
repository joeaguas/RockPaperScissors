#!/bin/bash

chmod +x rps_game.py
echo "Would you like to play Rock Paper Scissors? (YES/NO)"
read decision
if [$decision == "YES"]
then
    echo "Let's play!"
    python3 rps_game.py
else
    if [$decision == "NO"]
    then
        echo "That's too bad, maybe next time"
    else
        echo "I don't understand your answer. Please pick YES or NO next time..."
    fi
fi
    





