#!/bin/bash
source ~/.zshrc  

cleanup() {
    pkill -P $$
    exit 1
}

trap cleanup SIGINT

java -cp aisco.product.kharites --module-path aisco.product.kharites -m aisco.product.kharites &

wait