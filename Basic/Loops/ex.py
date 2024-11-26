import numpy as np
import matplotlib.pyplot as plt
import scipy.stats as stats

# Parameters
mu = 100  # mean
sigma = 0.25  # standard deviation
x_value = 99.5  # value to find the probability for

# Z-score calculation
z = (x_value - mu) / sigma

# Generate x values for the normal distribution curve
x = np.linspace(mu - 4*sigma, mu + 4*sigma, 1000)
y = stats.norm.pdf(x, mu, sigma)

# Plot the normal distribution curve
plt.figure(figsize=(10, 6))
plt.plot(x, y, label='Normal Distribution', color='blue')

# Fill the area for P(X < 99.5)
x_fill = np.linspace(mu - 4*sigma, x_value, 1000)
y_fill = stats.norm.pdf(x_fill, mu, sigma)
plt.fill_between(x_fill, y_fill, color='lightblue', alpha=0.5, label=f'P(X < {x_value})')

# Add labels and title
plt.xlabel('Weight (kg)')
plt.ylabel('Probability Density')
plt.title('Normal Distribution Curve')
plt.legend()

# Show the plot
plt.grid(True)
plt.show()
