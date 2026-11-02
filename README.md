# PurdueWeather

## Project Goal:
As a Purdue student who has to commute across campus, deciding whether to walk or take the bus depends heavily on personal weather tolerance, but standard weather and map apps only provide generic recommendations. This project solves this issue by offering personalized advice tailored to an individual student's weather comfort thresholds.

## MVP Scope
- **Profile Selection & Loading:** Select and load from multiple saved local user profiles upon startup.
- **User Profile Management:** Create and store multiple local user profiles containing specific weather comfort thresholds.
- **Weather Data Fetching:** Query real-time West Lafayette weather metrics (temperature, rain, and wind).
- **Threshold Evaluation:** Compare current weather conditions against the selected user's comfort limits.
- **Personalized Output:** Generate a clear commute recommendation ("Walk" or "Take the Bus") with a short reason.

## Future Plans
- **Profile Customization:** Edit and delete existing user profiles.
- **Advanced Decision Logic:** Weighted scoring systems (e.g., weighing rain heavier than wind) instead of basic pass/fail rules.
- **Route Considerations:** Factor in commute distance and estimated walking time for specific routes.
- **Class Schedule Integration:** Parse class schedule files to auto-recommend commute plans for each class.
- **UX & Error Handling:** Colored terminal text outputs (green for walking, red for busing) and graceful error handling for API outages.

## Tech Stack & Dependencies
- **Language:** Java
- **API:** [Open-Meteo API] (for fetching real-time weather metrics without requiring API keys)
- **Built-in Java Libraries:**
  - `java.net.http.HttpClient` – For managing HTTP requests to the Open-Meteo API.
  - `java.util.Scanner` – For processing command-line user inputs.
  - `java.io` – For reading and writing persistent profile data.
  - Java `String` utilities – For parsing raw API responses and formatted text files.
- **Data Storage:** Local plain text files (`.txt` or ‘.csv’) for lightweight, database-free persistence.# PurdueWeather
