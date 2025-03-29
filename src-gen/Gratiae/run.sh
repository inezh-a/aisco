#!/bin/bash
source ~/.zshrc  

cleanup() {
    pkill -P $$
    exit 1
}

trap cleanup SIGINT

java -cp aisco.product.gratiae --module-path aisco.product.gratiae -m aisco.product.gratiae &

wait