#!/usr/bin/env sh

set -e

# Gradle Wrapper script

if [ -n "${GRADLE_USER_HOME}" ]; then
  GRADLE_USER_HOME="${GRADLE_USER_HOME}"
else
  GRADLE_USER_HOME="$HOME/.gradle"
fi

if [ -x "${GRADLE_USER_HOME}/gradle" ]; then
  exec "${GRADLE_USER_HOME}/gradle" "$@"
fi

if [ -z "$GRADLE_HOME" ]; then
  echo "
"  echo "To run Gradle, you need to set GRADLE_HOME environment variable to Gradle installation directory."
  echo "Visiting https://gradle.org/install/ will help you"."
  exit 1
fi

exec "$GRADLE_HOME/bin/gradle" "$@"