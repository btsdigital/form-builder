#!/usr/bin/env bash
if [ "$TRAVIS_BRANCH" = 'master' ] && [ "$TRAVIS_PULL_REQUEST" == 'false' ]; then
    openssl aes-256-cbc -K $encrypted_129c7372d2f5_key -iv $encrypted_129c7372d2f5_iv -in cd/codesigning.asc.enc -out cd/codesigning.asc -d
fi