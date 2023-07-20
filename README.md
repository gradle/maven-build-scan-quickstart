# Maven Build Scan® quickstart

This is an example project that you can use to experience the [Build Scan® service of Gradle Enterprise][gradle.com].

It is a small Java project that has the [Gradle Enterprise Maven Extension][manual] already applied.

## Create a Build Scan®

Follow these simple steps to create and publish a Build Scan® on [scans.gradle.com][scans.gradle.com]:

1. Clone this project
1. Run `./mvnw clean test`

The build should end with something similar to:

    Publishing build scan...
    https://gradle.com/s/ria2s2x5oaazq

Follow the link shown at the end of the build to view your Build Scan® on [scans.gradle.com][scans.gradle.com].

## Experiment with Build Scans

Create different kinds of Build Scans by locally modifying this quickstart project. Here are some ideas:

- Edit `src/main/java/example/Example.java` to introduce compile errors
- Add more plugins and more projects

Alternatively, enable one of your own Maven builds to produce Build Scans by following the [step-by-step instructions][scans.gradle.com].

## Learn more

Read the [Gradle Enterprise Maven Extension User Manual][manual] to learn more about the Build Scan® service of Gradle Enterprise, build caching and the Gradle Enterprise Maven Extension.

## Need help?

Talk to us on the [Gradle forum][gradle-forum].

## License

The Maven Build Scan® quickstart project is open-source software released under the [Apache 2.0 License][apache-license].

[apache-license]: https://www.apache.org/licenses/LICENSE-2.0.html
[manual]: https://docs.gradle.com/enterprise/maven-extension
[gradle.com]: https://www.gradle.com
[terms-of-service]: https://gradle.com/terms-of-service
[scans.gradle.com]: https://scans.gradle.com
[gradle-forum]: https://discuss.gradle.org/c/help-discuss/scans