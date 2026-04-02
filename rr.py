import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns
import numpy as np

# 1. LOAD DATASET USING YOUR MAC PATH
file_path = '/Users/vishvaanbu/Desktop/student_placement_synthetic 2.csv'
df = pd.read_csv(file_path)

# 2. DATA PREPROCESSING (Required by Rubric)
# Fill missing salary values for unplaced students with 0
df['salary_package_lpa'] = df['salary_package_lpa'].fillna(0)

# Aggregation: Grouping by branch to see average performance
branch_summary = df.groupby('branch').agg({
    'cgpa': 'mean',
    'coding_skills': 'mean',
    'salary_package_lpa': 'mean',
    'placement_status': 'sum'
}).reset_index()

print("Data successfully loaded and preprocessed.")
print(branch_summary)

# 3. VISUALIZATIONS (Subtopic 4)

# Plot 1: Bar Chart of Placements by Branch
plt.figure(figsize=(10, 6))
sns.countplot(data=df, x='branch', hue='placement_status', palette='viridis')
plt.title('Placement Count by Branch')
plt.xlabel('Branch')
plt.ylabel('Number of Students')
plt.legend(title='Placed', labels=['No', 'Yes'])
plt.show()

# Plot 2: Scatter Plot of CGPA vs Salary
plt.figure(figsize=(10, 6))
# Filter to show only placed students for a clearer salary trend
placed_df = df[df['placement_status'] == 1]
sns.scatterplot(data=placed_df, x='cgpa', y='salary_package_lpa', hue='college_tier')
plt.title('Impact of CGPA on Salary Package (Placed Students Only)')
plt.show()

# Plot 3: Box Plot for Coding Skills
plt.figure(figsize=(10, 6))
sns.boxplot(data=df, x='placement_status', y='coding_skills', palette='Set2')
plt.title('Comparison of Coding Skills: Placed vs Unplaced')
plt.xticks([0, 1], ['Not Placed', 'Placed'])
plt.show()

# Plot 4: Heatmap (Correlation)
plt.figure(figsize=(12, 8))
numeric_df = df.select_dtypes(include=[np.number])
sns.heatmap(numeric_df.corr(), annot=True, cmap='coolwarm', fmt='.2f')
plt.title('Correlation Heatmap of All Factors')
plt.show()