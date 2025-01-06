import React from 'react';

function CategoryCard({ category }) {
  return (
    <div style={{ border: '1px solid black', padding: '10px', textAlign: 'center' }}>
      <div style={{ marginBottom: '10px' }}>
        <img src={category.photoUrl} alt={category.name} style={{ width: '100%', height: 'auto' }} />
      </div>
      <div>{category.name}</div>
    </div>
  );
}

export default CategoryCard;
