echo "start me with 'source ./set-local-env.sh' in each shell"
export JAVA_HOME=/home/robreder/.jdks/openjdk-18.0.1.1/
export PATH=/home/robreder/.jdks/openjdk-18.0.1.1/bin:$PATH
echo "JAVA_HOME=${JAVA_HOME}"
echo "PATH=${PATH}"
java -version
